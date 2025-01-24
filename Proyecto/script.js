document.addEventListener("DOMContentLoaded", () => {
    const slider = document.querySelector(".cards-slider");
    const cards = document.querySelectorAll(".card");
    const totalCards = cards.length;
    let currentIndex = 0;

    function slideToIndex(index) {
        const offset = -index * 100; // Desplazamiento en porcentaje (de una carta a la vez)
        slider.style.transform = `translateX(${offset}%)`; // Mueve el slider horizontalmente
    }

    function startSlider() {
        setInterval(() => {
            currentIndex = (currentIndex + 1) % totalCards; // Mueve al siguiente índice, ciclo
            slideToIndex(currentIndex);
        }, 5000); // Cambia cada 5 segundos
    }

    // Inicialización
    slideToIndex(currentIndex);
    startSlider();
    

    document.addEventListener("scroll", () => {
        const logo = document.querySelector(".logo");
        const scrollPosition = window.scrollY;
    
        // Ajusta la posición del logo con un efecto parallax
        logo.style.transform = `translate(-50%, ${scrollPosition * 0.2}px)`;
    });
});
