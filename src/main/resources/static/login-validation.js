/**
 * 
 */
var phoneNum = document.getElementById("phone");
var phoneError = document.getElementById("phoneError");

var pwd = document.getElementById("pass");
var cpass = document.getElementById("cpwd");
var passMatch = document.getElementById("matches");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");

//prompts when phone number block is clicked
phoneNum.onfocus = function() {
	document.getElementById("phoneMessage").style.display = "block";
}

// hide prompts when phone number block is unselected
phoneNum.onblur = function() {
	document.getElementById("phoneMessage").style.display = "none";
}

// prompts when password block is clicked
pwd.onfocus = function() {
	document.getElementById("message").style.display = "block";
}

// hide prompts when password block is unselected
pwd.onblur = function() {
	document.getElementById("message").style.display = "none";
}

//prompts when confirm password is clicked
cpass.onfocus = function() {
	document.getElementById("confMessage").style.display = "block";
}

// hide prompts when confirm password block is unselected
cpass.onblur = function() {
	document.getElementById("confMessage").style.display = "none";
}

// actions when user starts typing
pwd.onkeyup = function() {

	// check lowercase
	var lowerCaseLetters = /[a-z]/g;

	if (pwd.value.match(lowerCaseLetters)) {
		letter.classList.remove("invalid");
		letter.classList.add("valid");
		document.getElementById('submit').disabled = true;
	} else {
		letter.classList.remove("valid");
		letter.classList.add("invalid");
		document.getElementById('submit').disabled = false;
	}

	// check capital
	var upperCaseLetters = /[A-Z]/g;

	if (pwd.value.match(upperCaseLetters)) {
		capital.classList.remove("invalid");
		capital.classList.add("valid");
	} else {
		capital.classList.remove("valid");
		capital.classList.add("invalid");
	}

	// check numbers
	var numbers = /[0-9]/g;
	if (pwd.value.match(numbers)) {
		number.classList.remove("invalid");
		number.classList.add("valid");
	} else {
		number.classList.remove("valid");
		number.classList.add("invalid");
	}

	// check length
	if (pwd.value.length >= 8) {
		length.classList.remove("invalid");
		length.classList.add("valid");
	} else {
		length.classList.remove("valid");
		length.classList.add("invalid");
	}

}


//match confirm password
cpass.onkeyup = function () {
	
	// check matching passwords
	if (pwd.value == cpass.value) {
		passMatch.style.visibility = "hidden";
		//document.getElementById('submit').disabled = true;
		
	} else {
		passMatch.style.visibility = "visible";
		//document.getElementById('submit').disabled = false;
	}
}

//validate phone numbers
phoneNum.onkeyup = function () {
	var phoneRegex = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
	
	if (phoneNum.value.match(phoneRegex)) {
		phoneError.style.visibility = "hidden";
		//document.getElementById('Submit').disabled = true;
		
	} else {
		phoneError.classList.remove("valid");
		phoneError.classList.add("invalid");
		//document.getElementById('Submit').disabled = false;
	}
}