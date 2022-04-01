
// 10 minutes from now
var time_in_minutes = 10;
var current_time = Date.parse(new Date());
var deadline = new Date(current_time + time_in_minutes*60*1000);


function time_remaining(endtime){
	var t = Date.parse(endtime) - Date.parse(new Date());
	var seconds = Math.floor( (t/1000) % 60 );
	var minutes = Math.floor( (t/1000/60) % 60 );
	var hours = Math.floor( (t/(1000*60*60)) % 24 );
	var days = Math.floor( t/(1000*60*60*24) );
	return {'total':t, 'days':days, 'hours':hours, 'minutes':minutes, 'seconds':seconds};
}

var timeinterval;
function run_clock(id,endtime){
	var clock = document.getElementById(id);
	function update_clock(){
		var t = time_remaining(endtime);
		clock.innerHTML = t.minutes + ':' + t.seconds;
		if(t.total<=0){ clearInterval(timeinterval); }
	}
	update_clock(); // run function once at first to avoid delay
	timeinterval = setInterval(update_clock,1000);
}
run_clock('clockdiv',deadline);


var paused = false; // is the clock paused?
var time_left; // time left on the clock when paused

function pause_clock(){
	if(!paused){
		paused = true;
		clearInterval(timeinterval); // stop the clock
		time_left = time_remaining(deadline).total; // preserve remaining time
	}
}

function resume_clock(){
	if(paused){
		paused = false;

		// update the deadline to preserve the amount of time remaining
		deadline = new Date(Date.parse(new Date()) + time_left);

		// start the clock
		run_clock('clockdiv',deadline);
	}
}

// handle pause and resume button clicks
const playButton = document.querySelector(".play-button");
playButton.addEventListener("click", ()=> {
    resume_clock();
})

const pauseButton = document.querySelector(".pause-button");
pauseButton.addEventListener("click", ()=> {
    pause_clock();
})

// document.getElementById('pause').onclick = pause_clock;
// document.getElementById('resume').onclick = resume_clock;





// function startTimer(duration, display) {
//     var timer = duration, minutes, seconds;
//     countdown = setInterval(function () {
//         minutes = parseInt(timer / 60, 10);
//         seconds = parseInt(timer % 60, 10);

//         minutes = minutes < 10 ? "0" + minutes : minutes;
//         seconds = seconds < 10 ? "0" + seconds : seconds;

//         display.textContent = minutes + ":" + seconds;

//         if (--timer < 0) {
//             timer = duration;
//         }
//     }, 1000);
// }

// var timeSet = 60 * 5;

// function pauseTimer() {
//     clearInterval(countdown);
// }

// const playButton = document.querySelector(".play-button");

// playButton.addEventListener("click", ()=> {
//     display = document.querySelector('#time');
//     startTimer(timeSet, display);
// })

// // window.onload = function () {
// //     var fiveMinutes = 60 * 5,
// //         display = document.querySelector('#time');
// //     startTimer(fiveMinutes, display);
// // };

// const pauseButton = document.querySelector(".pause-button");

// pauseButton.addEventListener("click", ()=> {
//     pauseTimer();
// })