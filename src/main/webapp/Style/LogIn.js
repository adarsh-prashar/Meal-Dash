// Toggle password visibility
document.getElementById('passwordToggle').addEventListener('click', function() {
    var passwordField = document.getElementById('password');
    var toggleIcon = document.getElementById('passwordToggle');

    // Toggle the input type between 'password' and 'text'
    if (passwordField.type === 'password') {
        passwordField.type = 'text';  // Show password
        toggleIcon.classList.remove('fa-eye-slash');
        toggleIcon.classList.add('fa-eye');
    } else {
        passwordField.type = 'password';  // Hide password
        toggleIcon.classList.remove('fa-eye');
        toggleIcon.classList.add('fa-eye-slash');
    }
});

// Toggle dark mode functionality
const darkModeToggle = document.getElementById('darkModeToggle');
const body = document.body;

// Check if dark mode is saved in localStorage
if (localStorage.getItem('darkMode') === 'enabled') {
    body.classList.add('dark-mode');
}

// Toggle dark mode on button click
darkModeToggle.addEventListener('click', function() {
    body.classList.toggle('dark-mode');

    // Save dark mode status to localStorage
    if (body.classList.contains('dark-mode')) {
        localStorage.setItem('darkMode', 'enabled');
    } else {
        localStorage.setItem('darkMode', 'disabled');
    }
});
