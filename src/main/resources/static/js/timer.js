function updateTimer() {
    const start = new Date('2008-04-18');
    const now = new Date();

    // Calculate years and days
    let years = now.getFullYear() - start.getFullYear();
    let days = Math.floor((now - start) / (1000 * 60 * 60 * 24)) % 365;

    // Update display
    document.querySelectorAll('.counter span')[0].textContent = years;
    document.querySelectorAll('.counter span')[1].textContent = days;
}

// Update every second
setInterval(updateTimer, 1000);
updateTimer();