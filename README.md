# DATA-STRUCTURES-AND-ALGORITHMS..!

A comprehensive collection of **Data Structures and Algorithms** solutions in Java. This repository contains implementations of essential DSA problems for interview preparation, competitive coding practice, and skill development.

## Overview
This repository showcases clean, efficient implementations of fundamental data structure and algorithm problems. Each solution is optimized for both time and space complexity, making it ideal for coding interviews and competitive programming.

## Files & Descriptions
### 1. **TWOS-SUM.java**
**Problem**: Two Sum Problem
- **Description**: Find two numbers in an array that add up to a target sum
- **Time Complexity**: O(n²) for nested loop approach
- **Space Complexity**: O(1)
- **Use Case**: Array manipulation, interview prep
- **Algorithm**: Brute force nested loops (optimized versions use HashMap for O(n))
- **Key Concepts**: Array traversal, problem-solving strategies

### 2. **CONTAINS-DUPLICATES.java**
**Problem**: Contains Duplicate
- **Description**: Determine if an array contains any duplicate elements
- **Time Complexity**: O(n)
- **Space Complexity**: O(n) for HashSet
- **Use Case**: Duplicate detection, data validation
- **Algorithm**: HashSet-based approach for O(1) lookups
- **Key Concepts**: Hashing, Set data structure, tradeoff between time and space
- **Best Practice**: Uses set's add() return value for efficient checking

### 3. **VALID-ANAGRAM.java**
**Problem**: Valid Anagram
- **Description**: Check if two strings are anagrams of each other
- **Time Complexity**: O(n)
- **Space Complexity**: O(1) - fixed array of 26 lowercase letters
- **Use Case**: String comparison, anagram detection
- **Algorithm**: Character frequency counting using a fixed array
- **Key Concepts**: String manipulation, frequency arrays, counting sort basis
- **Optimization**: More efficient than sorting with O(1) space (vs O(n) for sorting)

### 4. **CONTAIN-DUPLICATES-TWO.java**
**Problem**: Contains Duplicate II (with distance constraint)
- **Description**: Find if array has duplicates within distance k
- **Time Complexity**: O(n)
- **Space Complexity**: O(min(n, k))
- **Use Case**: Sliding window problems, proximity search
- **Algorithm**: Sliding window with HashSet
- **Key Concepts**: Sliding window technique, set operations, dynamic window management
- **Feature**: Window size maintained at most k elements for efficient duplicate detection

## How to Use
1. **Clone the repository**:
   ```bash
   git clone https://github.com/Manikanta-23-ai/DATA-STRUCTURES-AND-ALGORITHMS..git
   cd DATA-STRUCTURES-AND-ALGORITHMS..
   ```

2. **Compile Java files**:
   ```bash
   javac TWOS-SUM.java
   javac CONTAINS-DUPLICATES.java
   javac VALID-ANAGRAM.java
   javac CONTAIN-DUPLICATES-TWO.java
   ```

3. **Test the solutions**:
   - Create a main method or test class to run each solution
   - Try different test cases for understanding edge cases

## Learning Objectives
- ✅ Master fundamental data structures (Arrays, HashSets)
- ✅ Understand time and space complexity analysis
- ✅ Learn optimization techniques (sliding window, hashing)
- ✅ Prepare for technical interviews
- ✅ Improve competitive coding skills

## Complexity Analysis Summary
| Problem | Time Complexity | Space Complexity | Algorithm Type |
|---------|-----------------|------------------|----------------|
| Two Sum | O(n²) | O(1) | Nested Loops |
| Contains Duplicate | O(n) | O(n) | Hash Set |
| Valid Anagram | O(n) | O(1) | Frequency Count |
| Contains Duplicate II | O(n) | O(k) | Sliding Window |

## Recommended Learning Path
1. Start with **TWOS-SUM.java** - Basic array manipulation
2. Move to **CONTAINS-DUPLICATES.java** - Introduction to hashing
3. Explore **VALID-ANAGRAM.java** - String processing concepts
4. Master **CONTAIN-DUPLICATES-TWO.java** - Advanced sliding window

## Related Topics
- HashSet/HashMap data structures
- Array operations and iteration
- Sliding window technique
- String manipulation in Java
- Time-Space complexity tradeoffs

## Resources
- LeetCode DSA problems
- Competitive coding platforms
- Technical interview preparation
- Data structures fundamentals

## Contributing
Feel free to:
- Submit optimized solutions
- Add more DSA problems
- Improve documentation
- Report issues

## License
Open source for educational purposes

## Acknowledgments
Built for learning and interview preparation. Happy coding!
