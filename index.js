// JavaScript code for simple scientific calculator logic
        // You can add your JavaScript code here
        // Calculator logic functions
        let display = document.getElementById('display');

        function appendToDisplay(value) {
            display.value += value;
        }
        
        function calculateResult() {
            try {
                display.value = eval(display.value);
            } catch (error) {
                display.value = 'Error';
            }
        }
        
        function clearDisplay() {
            display.value = '';
        }
        
            
        