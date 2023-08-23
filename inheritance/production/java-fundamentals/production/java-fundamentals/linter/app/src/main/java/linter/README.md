## Functions Used in the linter directory:

### main(String[] args):

Description: The main entry point of the application.

### jsLinter(String filePath):

Description: Performs linting on the given JavaScript file to identify missing semicolons at the end of lines.
Parameters:
filePath: The path to the JavaScript file to be analyzed.
Behavior:
Reads the file line by line.
Checks if the line is empty, ends with { or }, or contains if or else. Skips these cases.
If the line doesn't end with a semicolon ;, prints an error message indicating the line number and the missing semicolon.
Throws: IOException if there's an issue reading the file.

### IOException Handling:

Description: Catches and handles any IOException that might occur during file reading.
Behavior: If an IOException is caught, it prints an error message indicating the issue.