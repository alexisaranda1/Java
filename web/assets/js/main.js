// AutoCatalog JavaScript
class AutoCatalog {
    constructor() {
        this.cars = [
            {
                id: 1,
                name: "Honda Civic",
                type: "sedan",
                year: 2023,
                engine: "1.5L Turbo",
                transmission: "CVT",
                fuel: "Gasolina",
                price: "$24,999",
                icon: "🚗"
            },
            {
                id: 2,
                name: "Toyota RAV4",
                type: "suv",
                year: 2023,
                engine: "2.5L Híbrido",
                transmission: "CVT",
                fuel: "Híbrido",
                price: "$32,999",
                icon: "🚙"
            },
            {
                id: 3,
                name: "Ford Mustang",
                type: "deportivo",
                year: 2023,
                engine: "5.0L V8",
                transmission: "Manual",
                fuel: "Gasolina",
                price: "$45,999",
                icon: "🏎️"
            },
            {
                id: 4,
                name: "Volkswagen Jetta",
                type: "sedan",
                year: 2023,
                engine: "1.4L Turbo",
                transmission: "Automática",
                fuel: "Gasolina",
                price: "$22,999",
                icon: "🚗"
            },
            {
                id: 5,
                name: "Jeep Grand Cherokee",
                type: "suv",
                year: 2023,
                engine: "3.6L V6",
                transmission: "Automática",
                fuel: "Gasolina",
                price: "$38,999",
                icon: "🚙"
            },
            {
                id: 6,
                name: "Chevrolet Camaro",
                type: "deportivo",
                year: 2023,
                engine: "6.2L V8",
                transmission: "Manual",
                fuel: "Gasolina",
                price: "$42,999",
                icon: "🏎️"
            },
            {
                id: 7,
                name: "Nissan Altima",
                type: "sedan",
                year: 2023,
                engine: "2.5L",
                transmission: "CVT",
                fuel: "Gasolina",
                price: "$26,999",
                icon: "🚗"
            },
            {
                id: 8,
                name: "Mazda CX-5",
                type: "suv",
                year: 2023,
                engine: "2.5L",
                transmission: "Automática",
                fuel: "Gasolina",
                price: "$29,999",
                icon: "🚙"
            },
            {
                id: 9,
                name: "Porsche 911",
                type: "deportivo",
                year: 2023,
                engine: "3.0L Turbo",
                transmission: "PDK",
                fuel: "Gasolina",
                price: "$99,999",
                icon: "🏎️"
            }
        ];
        
        this.currentFilter = 'all';
        this.init();
    }

    init() {
        this.renderCars();
        this.setupEventListeners();
    }

    setupEventListeners() {
        // Smooth scrolling for navigation links
        document.querySelectorAll('.nav a, .cta-button').forEach(link => {
            link.addEventListener('click', (e) => {
                if (link.getAttribute('onclick')) return; // Skip if has onclick
                
                e.preventDefault();
                const targetId = link.getAttribute('href');
                if (targetId && targetId.startsWith('#')) {
                    const targetElement = document.querySelector(targetId);
                    if (targetElement) {
                        targetElement.scrollIntoView({
                            behavior: 'smooth',
                            block: 'start'
                        });
                    }
                }
            });
        });

        // Add animation on scroll
        this.observeElements();
    }

    renderCars(filter = 'all') {
        const carsGrid = document.getElementById('cars-grid');
        const filteredCars = filter === 'all' 
            ? this.cars 
            : this.cars.filter(car => car.type === filter);

        carsGrid.innerHTML = filteredCars.map(car => this.createCarCard(car)).join('');
        
        // Add animation to cards
        setTimeout(() => {
            document.querySelectorAll('.car-card').forEach((card, index) => {
                card.style.opacity = '0';
                card.style.transform = 'translateY(20px)';
                
                setTimeout(() => {
                    card.style.transition = 'all 0.5s ease';
                    card.style.opacity = '1';
                    card.style.transform = 'translateY(0)';
                }, index * 100);
            });
        }, 50);
    }

    createCarCard(car) {
        return `
            <div class="car-card" data-type="${car.type}">
                <div class="car-image">
                    ${car.icon}
                </div>
                <div class="car-info">
                    <h3>${car.name}</h3>
                    <span class="car-type">${this.getTypeLabel(car.type)}</span>
                    <div class="car-specs">
                        <div>
                            <span>Año:</span>
                            <span>${car.year}</span>
                        </div>
                        <div>
                            <span>Motor:</span>
                            <span>${car.engine}</span>
                        </div>
                        <div>
                            <span>Transmisión:</span>
                            <span>${car.transmission}</span>
                        </div>
                        <div>
                            <span>Combustible:</span>
                            <span>${car.fuel}</span>
                        </div>
                    </div>
                    <div class="car-price">${car.price}</div>
                </div>
            </div>
        `;
    }

    getTypeLabel(type) {
        const labels = {
            'sedan': 'Sedán',
            'suv': 'SUV',
            'deportivo': 'Deportivo'
        };
        return labels[type] || type;
    }

    observeElements() {
        const observer = new IntersectionObserver((entries) => {
            entries.forEach(entry => {
                if (entry.isIntersecting) {
                    entry.target.classList.add('animate-in');
                }
            });
        }, {
            threshold: 0.1
        });

        // Observe sections for animation
        document.querySelectorAll('section').forEach(section => {
            observer.observe(section);
        });
    }
}

// Global functions for button onclick handlers
function filterCars(type) {
    // Update active filter button
    document.querySelectorAll('.filter-btn').forEach(btn => {
        btn.classList.remove('active');
    });
    
    event.target.classList.add('active');
    
    // Filter and render cars
    catalog.currentFilter = type;
    catalog.renderCars(type);
}

function scrollToSection(sectionId) {
    const element = document.getElementById(sectionId);
    if (element) {
        element.scrollIntoView({
            behavior: 'smooth',
            block: 'start'
        });
    }
}

// Initialize the catalog when DOM is loaded
let catalog;
document.addEventListener('DOMContentLoaded', () => {
    catalog = new AutoCatalog();
    
    // Add loading animation
    document.body.style.opacity = '0';
    document.body.style.transition = 'opacity 0.5s ease';
    
    setTimeout(() => {
        document.body.style.opacity = '1';
    }, 100);
});

// Add CSS animations via JavaScript
const style = document.createElement('style');
style.textContent = `
    @keyframes fadeInUp {
        from {
            opacity: 0;
            transform: translateY(30px);
        }
        to {
            opacity: 1;
            transform: translateY(0);
        }
    }
    
    .animate-in {
        animation: fadeInUp 0.8s ease forwards;
    }
    
    .car-card {
        transition: all 0.3s ease;
    }
    
    .car-card:hover {
        transform: translateY(-5px);
    }
`;
document.head.appendChild(style);