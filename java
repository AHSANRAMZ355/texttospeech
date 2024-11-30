function generateSpeech() {
    var text = document.getElementById('textInput').value;
    if (text !== "") {
        var speech = new SpeechSynthesisUtterance(text);
        window.speechSynthesis.speak(speech);
    } else {
        alert("Please enter some text.");
    }
}
