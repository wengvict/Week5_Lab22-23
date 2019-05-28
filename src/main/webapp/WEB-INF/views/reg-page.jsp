<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="/reg-form-style.css">
<title>G&C-Join Us!</title>
</head>
<body>

	<h2>Stay in Touch!</h2>
	<h3>Be the first to hear about our newest artisan blends, keep
		track of your everyday favorites, and fall back in love with your
		favorite morning beverage.</h3>

	<div class="row">
		<form action="regform" method="POST">
			<div class="column">
			
			<h4 class="col1header">Fill out this side - it'll help us get to know you.</h4>
			<div class="left">First name: </div>
			<div class="right"><input type="text" id="firstname" name="firstname" required> </div> 
			<br> 
			<div class="left">Last name: </div>
			<div class="right"><input type="text" id="lastname" name="lastname" required> </div>
			<br>
			<br>
			<div class="left">Gender: </div>
			<div class="right"><input type="radio" id="gender" name="gender" value="male" required> Male 
			<input type="radio" id="gender" name="gender" value="female" required> Female 
			<input type="radio" id="gender" name="gender" value="unknown" required> Prefer Not to Say 
			</div>
			<br>
			<br>
			<div class="left">Phone number: </div>
			<div class="right"><input type="text" id="phone" name="phone" required> </div>
			<br> 
			<div class="left">Email: </div>
			<div class="right"><input type="text" id="email" name="email" required> </div>
			<br> 
			<div class="left">Password: </div>
			<div class="right"><input type="text" id="pass" name="pass" required> </div>
			<br> 
			<div class="left">Confirm password: </div>
			<div class="right"><input type="text" id="cpwd" name="cpwd" required> </div>
			</div>
			
			<div class="column">
			<h4>Don't worry about this side - you can fill out these details later.</h4>
				<div class="leftcol2">Address: </div>
				<div class="rightcol2"><input type="text" id="street" name="street"></div> 
				<br>
				<div class="leftcol2">City: </div>
				<div class="rightcol2"><input type="text" id="city" name="city"> </div>
				<div class="leftcol2">State: </div>
				<div class="rightcol2"><select
					name="state" id="state">
					<option value="" selected="selected">--</option>
					<option value="AL">AL</option>
					<option value="AK">AK</option>
					<option value="AZ">AZ</option>
					<option value="AR">AR</option>
					<option value="CA">CA</option>
					<option value="CO">CO</option>
					<option value="CT">CT</option>
					<option value="DE">DE</option>
					<option value="DC">DC</option>
					<option value="FL">FL</option>
					<option value="GA">GA</option>
					<option value="HI">HI</option>
					<option value="ID">ID</option>
					<option value="IL">IL</option>
					<option value="IN">IN</option>
					<option value="IA">IA</option>
					<option value="KS">KS</option>
					<option value="KY">KY</option>
					<option value="LA">LA</option>
					<option value="ME">ME</option>
					<option value="MD">MD</option>
					<option value="MA">MA</option>
					<option value="MI">MI</option>
					<option value="MN">MN</option>
					<option value="MS">MS</option>
					<option value="MO">MO</option>
					<option value="MT">MT</option>
					<option value="NE">NE</option>
					<option value="NV">NV</option>
					<option value="NH">NH</option>
					<option value="NJ">NJ</option>
					<option value="NM">NM</option>
					<option value="NY">NY</option>
					<option value="NC">NC</option>
					<option value="ND">ND</option>
					<option value="OH">OH</option>
					<option value="OK">OK</option>
					<option value="OR">OR</option>
					<option value="PA">PA</option>
					<option value="RI">RI</option>
					<option value="SC">SC</option>
					<option value="SD">SD</option>
					<option value="TN">TN</option>
					<option value="TX">TX</option>
					<option value="UT">UT</option>
					<option value="VT">VT</option>
					<option value="VA">VA</option>
					<option value="WA">WA</option>
					<option value="WV">WV</option>
					<option value="WI">WI</option>
					<option value="WY">WY</option>
				</select> </div>
				<br> 
				<div class="leftcol2">Zip Code: </div>
				<div class="rightcol2"><input type="text" id="zip" name="zip"></div>
				<br> 
				<input type="submit" id="submit" value="Submit">
			</div>
		</form>
	</div>
	
	<div id="phoneMessage">
		<p id="phoneError" class="invalid">Not quite a valid number, please try again.</p>
	</div>

	<div id="message">
		<h4>Password must contain the following:</h4>
		<p id="letter" class="invalid">A lowercase letter</p>
		<p id="capital" class="invalid">An uppercase letter</p>
		<p id="number" class="invalid">A number</p>
		<p id="length" class="invalid">At least eight characters</p>

	</div>

	<div id="confMessage">
		<p id="matches" class="invalid">Password does not match</p>
	</div>



	<script src="/login-validation.js"></script>
</body>
</html>