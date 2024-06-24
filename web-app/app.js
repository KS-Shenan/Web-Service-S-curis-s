function updateGuestCount(type, change) {
    const countElement = document.getElementById(`num${capitalize(type)}`);
    let count = parseInt(countElement.innerText);
    let numAdults = parseInt(document.getElementById('numAdults').innerText);
    let numTeens = parseInt(document.getElementById('numTeens').innerText);
    let numChildren = parseInt(document.getElementById('numChildren').innerText);

    if (change > 0 && (numAdults + numTeens + numChildren) >= 10) {
        alert("The total number of guests cannot exceed 10.");
        return;
    }

    count += change;
    if (count < 0) count = 0;
    countElement.innerText = count;
}

function capitalize(str) {
    return str.charAt(0).toUpperCase() + str.slice(1);
}

function updateRoomImage() {
    const roomType = document.getElementById('roomType').value;
    const roomImage = document.getElementById('roomImage');
    
    if (!roomType) {
        roomImage.style.display = "none";
        return;
    }

    if (roomType === "Standard") {
        roomImage.src = "images/standard.jpg";
        roomImage.alt = "Standard Room";
    } else if (roomType === "Deluxe") {
        roomImage.src = "images/deluxe.jpg";
        roomImage.alt = "Deluxe Room";
    } else if (roomType === "Suite") {
        roomImage.src = "images/suite.jpg";
        roomImage.alt = "Suite Room";
    }

    roomImage.style.display = "block";
}

document.getElementById('reservation-form').addEventListener('submit', async function(event) {
    event.preventDefault();

    const firstName = document.getElementById('firstName').value;
    const lastName = document.getElementById('lastName').value;
    const address = document.getElementById('address').value;
    const city = document.getElementById('city').value;
    const country = document.getElementById('country').value;
    const numAdults = parseInt(document.getElementById('numAdults').innerText);
    const numTeens = parseInt(document.getElementById('numTeens').innerText);
    const numChildren = parseInt(document.getElementById('numChildren').innerText);
    const breakfast = document.getElementById('breakfast').checked ? 'Yes' : 'No';
    const roomType = document.getElementById('roomType').value;
    const arrivalDate = document.getElementById('arrivalDate').value;
    const departureDate = document.getElementById('departureDate').value;

    if (numAdults + numTeens + numChildren > 10) {
        alert("The total number of guests cannot exceed 10.");
        return;
    }

    try {
        const response = await axios.post('http://localhost:8080/ReservationService', {
            firstName: firstName,
            lastName: lastName,
            address: address,
            city: city,
            country: country,
            numAdults: numAdults,
            numTeens: numTeens,
            numChildren: numChildren,
            breakfast: breakfast,
            roomType: roomType,
            arrivalDate: arrivalDate,
            departureDate: departureDate
        });

        document.getElementById('result').innerText = 'Reservation successful: ' + response.data;
    } catch (error) {
        console.error('There was an error making the reservation:', error);
        document.getElementById('result').innerText = 'Reservation failed. Please try again.';
    }
});

