javascript: (function() {
    document.getElementById('last-menu').remove();

    document.getElementById('footer').remove();

    var sbox = document.getElementsByClassName('spot bookmarks');
    if (sbox.length > 0){
    sbox[0].parentNode.removeChild(sbox[0]);}

    var likes = document.getElementsByClassName('spot likes');
    if (likes.length > 0){
    likes[0].parentNode.removeChild(likes[0]);}

    var slider = document.getElementsByClassName('homeTopBlock');
    slider[0].parentNode.removeChild(slider[0]);

})()
