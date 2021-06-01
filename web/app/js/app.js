const btnToggle = document.querySelector('#btnToggle');
const subMenu = document.querySelector('.sub-menu');
const arr = document.querySelectorAll('.giohang .list__content .item__details .inputBox');
const checkAll = document.getElementById('checkAll');
const openModal = document.getElementById('openModal');
const modal = document.getElementById('modal');
const search = document.getElementById('searchProducts');
const exitModal = document.querySelector('.modal__header a.exit');
let listCB = document.querySelectorAll('.admin .content table tbody input[type="checkbox"]');
const btnSearch = document.getElementById('btnSearch');
let childNodeUpdates = document.querySelectorAll('.giohang .list__content .item__details .inputBox input[type="number"]');

const fileUpload = document.getElementById('fileUpload');
const imgSrc = document.getElementById('demo-image');

if (btnSearch != null) {
    let txt = document.querySelector('input[name="txtKeyWord"]');

    btnSearch.addEventListener('click', function (event) {
        txt.focus();
    });
}

if (search != null) {
    search.addEventListener('keyup', function (event) {
        if (event.keyCode === 13) {
            console.log(event.targe.value)
        }
    })
}

if (arr != null) {
    arr.forEach(listBox => {
        listBox.childNodes[1].addEventListener('click', function () {
            if (parseInt(listBox.childNodes[3].value, 10) > 1) {
                listBox.childNodes[3].value = parseInt(listBox.childNodes[3].value, 10) - 1;
            }
        })
        listBox.childNodes[5].addEventListener('click', function () {
            listBox.childNodes[3].value = parseInt(listBox.childNodes[3].value, 10) + 1;
        })
    });
}


if (checkAll != null) {
    checkAll.addEventListener('click', function () {

        if (checkAll.checked) {
            listCB.forEach((item) => {
                item.checked = true;
            })
        } else {
            listCB.forEach((item) => {
                item.checked = false;
            })
        }
        let arr = [...listCB].map((item) => {
            if (item.checked) {
                return item.value;
            }
        })
    })
}

if (listCB != null) {
    listCB.forEach(function (item) {
        item.addEventListener('click', function () {
            if (!item.checked && checkAll.checked) {
                checkAll.checked = false;
            }
        })

    })
}

if (openModal != null && openModal != null) {
    openModal.addEventListener('click', function () {
        modal.classList.remove('isClose')
        modal.classList.add('isOpen')
    })
    exitModal.addEventListener('click', function () {
        modal.classList.remove('isOpen')
        modal.classList.add('isClose')
    })
}

if (btnToggle != null) {
    btnToggle.addEventListener('click', function () {
        if (btnToggle.classList.contains('isOpen')) {
            btnToggle.classList.remove('isOpen')
            subMenu.classList.remove('open')
        } else {
            btnToggle.classList.add('isOpen')
            subMenu.classList.add('open')
        }
    })
}

if (fileUpload != null) {
    fileUpload.addEventListener('change', function (e) {
        let name = e.target.files[0].name;
        imgSrc.src = `./app/img/coffee/${name}`
    })
}


if(childNodeUpdates.length > 0){
    childNodeUpdates.forEach((childNode)=>{
         let link = childNode.parentNode.parentNode.childNodes[5].childNodes[3];
        link.addEventListener('click',function(e){
            e.preventDefault();
           let oldHref = link.href + "&amount="+childNode.value;
           window.location.href= oldHref;
        })
    })
}