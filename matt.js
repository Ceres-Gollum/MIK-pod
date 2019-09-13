// =================== Fetch Bonuses
//
// -- Ex. 1
//
// In your data directory, create a profiles.json file with the following...
//
// {
//     "sandy123": "brown",
//     "bob234": "green",
//     "sally345": "blue"
// }
//
// Add an input field and submit button (you will need to prevent the default behaviour) that when clicked, runs the following function...
// Create a function that takes in a username and fetch's the color preference based on the username and sets the background color to that color.
//

function getColors(){

    return fetch('data/profiles.json')
        .then(data => data.json())
        .then(data => data)
    // .catch( (error) => console.log(error)); // Rejected Promise
}
getColors();//Call function on load

// Submit Button
$('#submitBtn').on('click', function (e) {
    e.preventDefault();

    getColors().then((object) => {
        let userInput = document.getElementById("userText").value; // User input
        console.log(userInput);
        console.log(object);
        console.log(object[userInput]); //returns brown if user types in sandy123
        let magicColor = object[userInput];
        $('body').css('background', magicColor);
        // document.body.style.background = `${magicColor}`;


        // getColors();//Call function on load
        // console.log(object[userInput]);
    }).catch((error) => console.log(error)); // End of getColors

}); // End of Submit button

// =====================================================================================================================================================================

// -- Ex. 4
//
// Create star-chars.json file in your data folder and paste in the following...
//
// [
//     {
//         "name": "Rey",
//         "coolness": 9
//     },
//     {
//         "name": "Luke Skywalker",
//         "coolness": 9
//     },
//     {
//         "name": "Darth Vadar",
//         "coolness": 10
//     }
// ]
//
// Create a function that fetches this array and returns an array of homeworlds for the characters.
//     It will look something like the following...
//
// ['Jakku', 'Tatooine', 'Tatooine']

function getCharacters(){

    return fetch('data/star-chars.json')
        .then(data => data.json())
        .then(data => data)
        .catch( () => console.log('Something went wrong!')); // Rejected Promise
}
getCharacters();//Call function on load

function getHomeWorld(){

    return fetch('data/star-chars.json')
        .then(data => data.json())
        .then(data => data)
        .catch( () => console.log('Something went wrong!')); // Rejected Promise
}
getHomeWorld();//Call function on load


getHomeWorld().then(data => {
    console.log(data);
    let homeName = data.map(function (home) {

        return home.homeworlds
    });
    // Logs the home names of names in array
    console.log(homeName);
});



const incremented = numbers.map(n => n + 1);
console.log(incremented); // [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]

// console.log(getHomeWorld());


// gethomeworld().then(data => {
//     // console.log(data.results);
//
//     getCharacters().then(data => {
//         data.forEach((datum) => {
//             if (datum.name === )
//         })
//     })
//     let filteredData = data.results.filter(function (people) {
//         return people.name === 'Luke Skywalker'
//
//     });
//     console.log(filteredData);
// });
// =====
// Example
// var numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
//
// var evens = numbers.filter(function(n) {
//     return n % 2 === 0;
// });
// console.log(evens); // [2, 4, 6, 8, 10]


// ==================================================
// Map-Filter-Reduce Bonus

const customers = [
    {
        name: "Fred",
        age: 58,
        occupation: "Police Officer",
        noOfPurchases: 4
    },
    {
        name: "Samantha",
        age: 54,
        occupation: "Teacher",
        noOfPurchases: 18
    },
    {
        name: "Charles",
        age: 38,
        occupation: "Librarian",
        noOfPurchases: 9
    }
];

// PROBLEM 3 - create an array of civil servant customers (teachers and police officers)
// containing the same properties as the objects on the customers objects
let civilServants = customers.filter(function (customer) {
    // return customer.name
    if(customer.occupation === 'Teacher'){
        return customer
    }else if(customer.occupation === 'Police Officer'){
        return customer
    }

});

console.log(civilServants);