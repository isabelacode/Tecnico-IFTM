const menuButton = document.getElementById("menu-btn");
const navbarCenter = document.querySelector(".navbar-center");

menuButton.addEventListener("click", () => {
  navbarCenter.classList.toggle("active");
});
const carouselWrapper = document.querySelector(".carousel-wrapper");

var swiper = new Swiper(".mySwiper", {
  slidesPerView: 1,
  spaceBetween: 10,
  navigation: {
    nextEl: ".swiper_next",
    prevEl: ".swiper_prev",
  },
  pagination: {
    el: ".swiper-pagination",
    clickable: true,
  },
  breakpoints: {
    1100: {
      slidesPerView: 4,
    },
    800: {
      slidesPerView: 3,
    },
    200: {
      slidesPerView: 2,
    },
  },
});
