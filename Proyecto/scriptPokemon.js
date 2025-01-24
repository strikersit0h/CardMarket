document.addEventListener("DOMContentLoaded", () => {
    const slider = document.querySelector(".cards-slider");
    const cards = document.querySelectorAll(".card");
    const totalCards = cards.length;
    let currentIndex = 0;

    function slideToIndex(index) {
        const offset = -index * 100; // Desplazamiento en porcentaje (de una carta a la vez)
        slider.style.transform = `translateY(${offset}%)`; // Mueve el slider verticalmente
    }

    function startSlider() {
        setInterval(() => {
            currentIndex = (currentIndex + 1) % totalCards; // Mueve al siguiente índice, ciclo
            slideToIndex(currentIndex);
        }, 1000); // Cambia cada 5 segundos
    }

    // Inicialización
    slideToIndex(currentIndex);
    startSlider();
});
