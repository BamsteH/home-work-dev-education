function push() {

    var one = Number(document.getElementById('numFirst').value);
    var two = Number(document.getElementById('numSecond').value);
    

    switch (operation.value){
        case '+':
            result.value = one + two;
            break;
        case '-':
            result.value = one - two;
            break;
        case '/':
            result.value = one / two;
            break;
        case '*':
            result.value = one * two;
            break;
        default:
            result.value = "OO";
            break;
    }
}
