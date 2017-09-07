import re
import os

def get_filepaths(directory):
    """
    This function will generate the file names in a directory
    tree by walking the tree either top-down or bottom-up. For each
    directory in the tree rooted at directory top (including top itself),
    it yields a 3-tuple (dirpath, dirnames, filenames).
    """
    file_paths = []  # List which will store all of the full filepaths.

    # Walk the tree.
    for root, directories, files in os.walk(directory):
        for filename in files:
            # Join the two strings in order to form the full filepath.
            filepath = os.path.join(root, filename)
            file_paths.append(filepath)  # Add it to the list.

    return file_paths  # Self-explanatory.

# Run the above function and store its results in a variable.
full_file_paths = get_filepaths(".\\drumMaps")

for fn in full_file_paths:
    f = open(fn, 'r')

    drum_map_name = fn.split('\\')[2].split('.')[0]
    result = '{\n\t"name": \"' + drum_map_name + '\",\n\t"pieces": [\n'

    content = f.read()
    content = re.sub(r'(\"\,|\,) ', r'\1', content)

    content = re.findall(r'(\w*|\_)\((.*\")\,(\d+)\,((\w+|.)+).*\)(,|;)', content)

    buffer = []
    for found in content:
        buffer.append('\t\t{\n\t\t\t"name":'+found[1]+',\n\t\t\t"midiNote":'+found[2]+',\n\t\t\t"type":"'+found[0]+'"\n\t\t}')

    result += ',\n'.join(buffer)
    result += '\n\t]\n}'

    g = open('./postprocessed/'+drum_map_name+'.json', 'w')
    g.write(result)
