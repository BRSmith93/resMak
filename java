javascript: (function() {
    const elements = document.getElementsByClassName("mgbox");
    while (elements.length > 0) elements[0].remove();
    var foter = document.getElementsByClassName("text-center site-footer");
    foter[0].parentNode.parentNode.removeChild(foter[0].parentNode);
    var social = document.getElementsByClassName("idmuvi-social-share");
    social[0].parentNode.removeChild(social[0]);
    var warta = document.getElementsByClassName("warta");
    warta[0].parentNode.removeChild(warta[0]);
    var social2 = document.getElementsByClassName("idmuvi-social-share");
    social2[0].parentNode.removeChild(social2[0]);
})()
