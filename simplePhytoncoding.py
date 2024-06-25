
name=input("Enter the name  :")
print(name)
print(type(name))
#String function in python
print(len(name))                #length of the name
print(name.find("a"))       #To find the character in a String
print(name.capitalize()) #TO capitalize the Small characters to Capital characters but it don't work when there is Space in between ,make the first character have upper case and the rest lower case.
print(name.lower())               # Makes the Capital characters in a String to lower , specifically the capital characters are converted to lower and the lower remains the same.
print(name.isdigit())               # verifies the given input is a digit or not. if yes =true of if no it is false.
print(name.isalpha())             # to verify whether the string contains only the alphabetical characters. Note: if there is Space between then we get false
print(name.count("a"))           # To find the number of similar characters in a String.
print(name.replace("a","o")) # is used to replace the characters.
print(name*3)                       # these used to print name the written number of times i.e..., 3