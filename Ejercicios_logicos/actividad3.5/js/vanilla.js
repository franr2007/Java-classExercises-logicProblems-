var texto=document.querySelectorAll("p");
var tamanoTexto= 16;
var contadorColores=0;
var contenedor= document.getElementById("contenidor");


function augmentarMida(){
    tamanoTexto+=2;
    texto.style.fontSize=tamanoTexto+'px'; 
}

function disminuirMida(){
    tamanoTexto-=2;
    texto.style.fontSize=tamanoTexto+'px'; 
}

function canviarColor(){
    if(contadorColores==0){
        texto.forEach(texto => texto.style.color="blue");
    }
    else if(contadorColores==1){
        texto.forEach(texto => texto.style.color="green");
    }
    else if(contadorColores==2){
        texto.forEach(texto => texto.style.color="yellow");
    }
    else if(contadorColores==3){
        texto.forEach(texto => texto.style.color="purple");
    }
    else{
        texto.forEach(texto => texto.style.color="red");
        contadorColores=0;
    }
    contadorColores+=1;
}

function afegirParagraf(){
    var textop= prompt("que quiere poner en el parrafo?");
    var p=document.createElement("p");
    p.textContent=textop;
    contenedor.appendChild(p);
    texto=document.querySelectorAll("p");
}

function eliminarParagraf(){
    
}

function afegirClasse(){
    
}

function eliminarClasse(){
    
}