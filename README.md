# Thread-with-Sound-Effects
A simple and not complicated Java project not going to lie they it may have some errors but I am doing my best had a hard time compiling it
![](screenshoot/screenshoots.gif)
click <audio id="ID004" source src="004.mp3"></audio><button onclick="playAudio('ID004')" type="button">play4</button> and then <audio id="ID003" source src="003.mp3"></audio><button onclick="playAudio('ID003')" type="button">play3</button>
<script>
function playAudio(audio_element) {
	var x = document.getElementById(audio_element);
	x.play();
}
</script>
