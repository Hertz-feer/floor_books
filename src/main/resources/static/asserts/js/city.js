
function  showCity(){
    var pid = $("#prov").val();
    $.ajax({
        async:false,
        url:"/show",
        data:{pid:pid},
        type:"POST",
        dataType:"JSON",
        success:function (districts) {
            var str;
            for(var i =0;i<districts.length;i++){
                str = str+"<option value="+districts[i].id+">"+districts[i].address+"</option>"
            }
            $("#city").html(str)
        }
    })
    showCountry();
}

function showCountry() {
    var pid = $("#city").val();
    // alert(pid)
    $.ajax({
        async: false,
        url:"/show",
        data: {pid:pid},
        type:"POST",
        dataType: "JSON",
        success:function (districts) {
            var str;
            for(var i =0;i<districts.length;i++){
                str = str+"<option value="+districts[i].id+">"+districts[i].address+"</option>"
            }
            $("#area").html(str)
        }
    })
}