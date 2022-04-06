import playAmbient from "./audio.js";

var timeinterval;
var paused = false; // is the clock paused?
var time_left; // time left on the clock when paused
var time_in_minutes;
var current_time;
var deadline;

export default function makeTimer(increment) {
	time_in_minutes = increment;
	current_time = Date.parse(new Date());
	deadline = new Date(current_time + time_in_minutes*60*1000);
	paused = false;
	run_clock('clockdiv',deadline);

	pause_clock();
	const playButton = document.querySelector(".play-button");
	playButton.addEventListener("click", ()=> {
		resume_clock();
		const audioEl = document.querySelector(".audio");
        audioEl.innerHTML += playAmbient();
	})

	const pauseButton = document.querySelector(".pause-button");
	pauseButton.addEventListener("click", ()=> {
		pause_clock();
	})

}


function time_remaining(endtime){
	var t = Date.parse(endtime) - Date.parse(new Date());
	var seconds = Math.floor( (t/1000) % 60 );
	var minutes = Math.floor( (t/1000/60) % 60 );
	var hours = Math.floor( (t/(1000*60*60)) % 24 );
	var days = Math.floor( t/(1000*60*60*24) );
	return {'total':t, 'days':days, 'hours':hours, 'minutes':minutes, 'seconds':seconds};
}


function run_clock(id,endtime){
	var clock = document.getElementById(id);
	function update_clock(){
		var t = time_remaining(endtime);
		if(t.seconds < 10) {
			clock.innerHTML = t.minutes + ':0' + t.seconds;
		}
		else {
			clock.innerHTML = t.minutes + ':' + t.seconds;
		}
		if(t.total<=0){ clearInterval(timeinterval); }
	}
	update_clock(); // run function once at first to avoid delay
	timeinterval = setInterval(update_clock,1000);
}




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

