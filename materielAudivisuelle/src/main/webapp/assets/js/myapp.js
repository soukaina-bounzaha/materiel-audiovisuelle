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
		if(menu =="Home") break;
		$('#ListdesEvenement').addClass('active');
	    $('#a_'+menu).addClass('active');
	
		break;
	
	}
	
	//code for Jquery DataTable 
	//create a dataset
	
	var evenement = [
		
		          ['1','lala'],
		          ['2','dodo'],
		          ['3','basla'],
		          ['4','bzaf'],
		          ['5','mais'],
		          ['6','kanbghiha']
		
	];
	
	var $table = $('#EvenementListTable');
	
	//execute the below cde ony whene we have this table 
	
	if($table.length){
		
		//console.log('inside the table ');
		
		 $table.DataTable({
			 data: evenement
			 
		 });
	}
	
});