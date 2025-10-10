//DOM - Doccument object model
// button click event
const clickbtn=document.getElementById("clickbtn");
const clickmsg=document.getElementById("clickmsg");

clickbtn.addEventListener("click", function(){
    clickmsg.textContent="Button clicked."
    clickmsg.style.color="green";
})

const hoverbox=document.getElementById("hoverbox");
hoverbox.addEventListener("mouseover", function(){
    hoverbox.style.background="limegreen";
    hoverbox.textContent="Hovered!"
});

const name=document.getElementById("name");
const greeting=document.getElementById("greeting");

name.addEventListener("input",function(){
    const display=name.value.trim();
    greeting.textContent=display ? `Welcome, ${display}`:"";
})