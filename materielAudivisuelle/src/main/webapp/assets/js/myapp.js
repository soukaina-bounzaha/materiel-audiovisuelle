$(function(){
	
	//solving the avtive menu problem
	
	switch(menu){
	   
	case 'About Us':
		$('#about').addClass('active');
		break;
		
	case 'Contact Us':
		$('#contact').addClass('active');
		break;
		
	case 'List Evenement ':
		$('#ListdesEvenement').addClass('active');
		break;
		
	default :
		$('#ListdesEvenement').addClass('active');
	    $('#a_'+menu).addClass('active');
	
		break;
	
	}
	
	
});