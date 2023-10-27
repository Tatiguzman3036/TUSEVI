let map = L.map('map').setView([0, 0], 15); // Inicializa el mapa con un zoom más alto

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
        attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
    }).addTo(map);

    // Obtiene la ubicación del usuario
    if ('geolocation' in navigator) {
        navigator.geolocation.getCurrentPosition(function (position) {
            let userLocation = [position.coords.latitude, position.coords.longitude];

            // Centra el mapa en la ubicación del usuario
            map.setView(userLocation, 15);
            // Añade un marcador en la ubicación del usuario
            L.marker(userLocation).addTo(map);
        });
    }
