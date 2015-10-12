String str

print "Please enter a number "
str = System.console().readLine();
double number1 = Integer.parseInt(str);

print "Please enter another number "
str = System.console().readLine();
double number2 = Integer.parseInt(str);

println "Please choose an operation to perform: "
println "(1) Add (2) Subtract (3) Multiply (4) Divide"
print "Your choice: "
str = System.console().readLine();
int operation = Integer.parseInt(str);

if (operation == 1) {
	println (number1 + number2)
}
else if (operation == 2) {
	println (number1 - number2)	
}
else if (operation == 3) {
	println (number1 * number2)
}
else {
	println (number1 / number2)
}
