$(document).ready(function()
   {
   var x = 2;

    $(document).on('click', '.btn-add1', function(e)
    {
        e.preventDefault();

        var controlForm = $('.genres-form'),
            currentEntry = $(this).parents('.entry:first'),
            newEntry = $(currentEntry.clone()).appendTo(controlForm);

        newEntry.find('input').val('');
        controlForm.find('.entry:not(:last) .btn-add1')
            .removeClass('btn-add1').addClass('btn-remove')
            .removeClass('btn-success').addClass('btn-danger')
            .attr('id', x)
            .html('<span class="fa fa-minus"></span>');

        x++;
    }).on('click', '.btn-remove', function(e)
    {
		$(this).parents('.entry:first').remove();

		e.preventDefault();

		x--;
		return false;
	});


	$(document).on('click', '.btn-add2', function(e)
        {
            e.preventDefault();

            var controlForm = $('.countries-form'),
                currentEntry = $(this).parents('.entry:first'),
                newEntry = $(currentEntry.clone()).appendTo(controlForm);

            newEntry.find('input').val('');
            controlForm.find('.entry:not(:last) .btn-add2')
                .removeClass('btn-add2').addClass('btn-remove')
                .removeClass('btn-success').addClass('btn-danger')
                .html('<span class="fa fa-minus"></span>');
        }).on('click', '.btn-remove', function(e)
        {
    		$(this).parents('.entry:first').remove();

    		e.preventDefault();
    		return false;
    	});
});