let wrapper = document.querySelector('.wrapper');
let loginLink = document.querySelector('.login-link');
let registerLink = document.querySelector('.register-link')
registerLink.addEventListener('click', ()=>{
    wrapper.classList.add('active');
});
loginLink.addEventListener('click', ()=>{
    wrapper.classList.remove('active');
});
