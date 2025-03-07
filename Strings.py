import re  

# 1. Different ways of creating a string
str1 = "Hello, World!"  # Using double quotes
str2 = 'Hello, Python!'  # Using single quotes
str3 = """This is a multiline
string using triple quotes"""
print("1. Different ways of creating a string:")
print(str1, str2, str3, sep="\n")

# 2. Concatenating two strings using + operator
str_concat = str1 + " " + str2
print("\n2. Concatenated String:", str_concat)

# 3. Finding the length of the string
print("\n3. Length of String:", len(str1))

# 4. Extract a string using Substring (Slicing)
substring = str1[0:5]  # Extracting "Hello"
print("\n4. Extracted Substring:", substring)

# 5. Searching in strings using index()
search_word = "World"
index = str1.index(search_word) if search_word in str1 else -1
print("\n5. Index of 'World':", index)

# 6. Matching a string against a regular expression
pattern = r"Hello"
match = re.match(pattern, str1)
print("\n6. Regular Expression Match:", "Matched" if match else "Not Matched")

# 7. Comparing strings
str4 = "Apple"
str5 = "Banana"
comparison = "Equal" if str4 == str5 else "Not Equal"
print("\n7. String Comparison:", comparison)

# 8. startsWith(), endsWith() and compareTo()
print("\n8. startsWith(), endsWith():")
print("Starts with 'Hello':", str1.startswith("Hello"))
print("Ends with 'World!':", str1.endswith("World!"))

# 9. Trimming strings with strip()
str6 = "  Hello, Python!  "
print("\n9. Trimmed String:", str6.strip())

# 10. Replacing characters in strings with replace()
print("\n10. String after replacing 'o' with '0':", str1.replace("o", "0"))

# 11. Splitting strings with split()
split_str = str1.split(", ")
print("\n11. Splitting String:", split_str)

# 12. Converting integer objects to Strings
num = 123
str_num = str(num)
print("\n12. Integer to String:", str_num)

# 13. Converting to uppercase and lowercase
print("\n13. Uppercase:", str1.upper())
print("Lowercase:", str1.lower())
