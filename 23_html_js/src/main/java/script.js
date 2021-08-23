const data = [
    {
        "login": "andrii",
        "pass": "andriiY"
    },
    {
        "login": "name",
        "pass": "pass"
    }
]

const main = document.getElementById('main');

const form = document.createElement('form');

const form_wrap = document.createElement('div');
form_wrap.setAttribute('class', 'form__modal_wrapper');

function create(setClass, setLength, setPlaceHolder, urClass) {
    urClass.setAttribute('class', setClass);
    urClass.setAttribute('maxLength', setLength);
    urClass.setAttribute('placeholder', setPlaceHolder);
}

const login = document.createElement('input');
create('form__login form__input', '20', 'login', login);

const password = document.createElement('input');
create('form__password', '20', 'password', password);
password.setAttribute('required', 'true');
password.setAttribute('type', 'password');

const button = document.createElement('button');
button.setAttribute('class', 'btn');
button.setAttribute('type', 'button');
const buttonText = document.createTextNode('LogIn');
button.append(buttonText);

form_wrap.append(login);
form_wrap.append(password);
form_wrap.append(button);

form.append(form_wrap);

main.append(form);

button.addEventListener('click', (e) => {
        let logg = login.value;
        let pass = password.value;
        const regex = / ^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[$&@*-])[A-Za-z\d$&@*-]{5,10}$ /;
        let regexTestPass = regex.test(logg);
        let regexTestLog = regex.test(pass);
        if (regexTestPass === false) {
            password.style.border = "1px solid green";
        } else {
            password.style.border = "1px solid red";
        }
        if (regexTestLog === false) {
            login.style.border = "1px solid green";
        } else {
            login.style.border = "1px solid red";
        }
        let auth = false;
        let i = 0;
        while (i < data.length){
            if (data[i].login === logg && data[i].pass === pass){
                auth = true;
            }
            i++;
        }
        if (auth === true){
            alert("Access");
        } else {
            alert("Smth Wrong");
        }
    }
)



