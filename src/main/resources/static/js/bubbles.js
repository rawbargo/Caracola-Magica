document.addEventListener("DOMContentLoaded", function() {
    const bubblesContainer = document.querySelector(".bubbles-container");
    
    function createBubble() {
        const bubble = document.createElement("div");
        bubble.classList.add("bubble");
        
        const size = Math.random() * 60 + 20; // Tamaño aleatorio entre 20px y 80px
        bubble.style.width = `${size}px`;
        bubble.style.height = `${size}px`;
        bubble.style.left = `${Math.random() * 100}%`; // Posición horizontal aleatoria
        
        bubblesContainer.appendChild(bubble);
        
        // Eliminar la burbuja después de que termine su animación
        bubble.addEventListener("animationend", () => {
            bubble.remove();
        });
    }

    // Crear una burbuja cada 500ms
    setInterval(createBubble, 500);
});
