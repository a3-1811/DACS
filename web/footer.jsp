<%@page contentType="text/html" pageEncoding="UTF-8"%>
<footer class="mt-5 flex jc-sa ai-c">
        <div class="footer__main container flex jc-sa ">
            <div class="col">
                <h2>Liên hệ</h2>
                <ul>
                    <li><i class="fa fa-phone" aria-hidden="true"></i> (+84) 0392680723</li>
                    <li><i class="fab fa-github"></i>abe18-11</li>
                    <li><i class="fa fa-envelope" aria-hidden="true"></i>huybest10@gmail.com</li>
                </ul>
            </div>
            <div class="col">
                <h2>Thời gian mở cửa</h2>
                <ul>
                    <li><i class="fa fa-check"></i>Monday - Saturday ( 7am - 9pm )</li>
                    <li><i class="fa fa-check"></i>Sunday (7am - 1pm)</li>
                </ul>
            </div>
            <div class="col">
                <h2>Địa chỉ</h2>
                <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3919.1250520425215!2d106.71230301397601!3d10.801733161681753!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x317528a459cb43ab%3A0x6c3d29d370b52a7e!2sHutech%20University!5e0!3m2!1sen!2s!4v1616234485593!5m2!1sen!2s" width="350" height="200" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
            </div>
        </div>
        <p class="footer__cp">
            © Copyright 2021 CCS. All rights reserved.
        </p>
    </footer>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
    <script src="./app/js/owl.carousel.min.js"></script>
    <script src="./app/js/app.js"></script>
    <script>
        $('.owl-carousel').owlCarousel({
    loop:true,
    margin:10,
    nav:true,
    dots: false,
    autoplay:true,
    slideTransition: "all 0.5s" ,
    autoplayTimeout: 3000,
    responsive:{
        0:{
            items:2
        },
        600:{
            items:3
        },
        1000:{
            items:4
        }
    }
})
    </script>>
