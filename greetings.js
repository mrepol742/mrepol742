var date = new Date();
var hrs = date.getHours();
var greet;

if (hrs < 12) {
    greet = "Good Morning";
} else if (hrs >= 12 && hrs <= 17) {
    greet = 'Good Afternoon';
} else if (hrs >= 17 && hrs <= 24) {
     greet = 'Good Evening'; 
} 

