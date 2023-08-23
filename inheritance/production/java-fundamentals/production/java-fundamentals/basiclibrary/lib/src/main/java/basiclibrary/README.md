*Lab-02*

## Functions Used in this directory:

- Main
- roll
- containsDuplicates
- calculateAverage
- arraysOfArrays
- analyzingWeather
- trally

### analyzingWeather(int array[][]):

Description: Analyzes a 2D array of temperature data to find the highest and lowest temperatures, and identifies missing temperatures within the given range.
Parameters:
array[][]: A 2D array containing temperature data.
Behavior:
Initializes uniqueTem to track unique temperatures using a HashSet.
Iterates through the array to find the minimum and maximum temperatures.
Creates a list of missing temperatures within the range [min, max].
Constructs a result string containing high, low, and missing temperatures.
Returns: A formatted string indicating high, low temperatures, and any missing temperatures.

### tally(List<String> names):

Description: Tallies votes from a list of names and identifies the name with the most votes.
Parameters:
names: A list of names representing votes.
Behavior:
Initializes nameCounts to store name frequencies using a HashMap.
Iterates through the names, updating their vote counts in nameCounts.
Identifies the name with the maximum vote count as the winner.
Returns: The name with the most votes (winner).