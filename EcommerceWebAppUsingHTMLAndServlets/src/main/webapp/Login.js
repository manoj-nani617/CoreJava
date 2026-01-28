function submitForm() {
	let username = document.getElementById("email");
	let password = document.getElementById("pass");
	let container = document.getElementsByClassName("login-container")[0];
	if(password.value === confirmPassword.value)
		 return true;
	else {
		let parent = document.createElement("div");
		let div = document.createElement("div");
		div.innerText = "Password Mismatched";
		div.style.color = "red";
		parent.prepend(div);
		container.prepend(parent);
		parent.style.textAlign = "center";
		password.value = "";
		
		return false;
	}

}