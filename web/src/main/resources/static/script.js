$(function(){
    var editor = ace.edit("source");

    editor.setTheme("ace/theme/xcode");
    editor.setFontSize("1em");
    //editor.setShowInvisibles(true);
    editor.getSession().setMode("ace/mode/groovy");

    var textarea = $("textarea[name='source']").hide();

    editor.getSession().setValue(textarea.val());
    editor.getSession().on("change", function(){
        textarea.val(editor.getSession().getValue());
    });
});
