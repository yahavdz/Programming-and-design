import os
from zipfile import ZipFile

array = ['a','b','c','d']

for letter in array:
    fileName = letter + '.txt'
    open(fileName, 'w')
    
    if not os.path.exists(fileName):
        raise Exception('text file ' + fileName + 'was not created')
    
    # TODO 
    VERSION = os.environ.get('VERSION')
    zipName = letter + '_' + VERSION + '.zip'
    with ZipFile(zipName, 'w') as zipObj:
        zipObj.write(fileName)
    
    if not os.path.exists(zipName):
        raise Exception('zip file ' + zipName + 'was not created')
