function submitForm() {
	let username = document.getElementById("user");
	let password = document.getElementById("pass");
	let submit = document.getElementById("submit");
	let confirmPassword = document.getElementById("confirmPassword");
	let container = document.getElementsByClassName("register-box")[0];
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
		confirmPassword.value = "";
		
		return false;
	}

}