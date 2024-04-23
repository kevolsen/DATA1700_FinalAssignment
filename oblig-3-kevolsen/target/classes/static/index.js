$(function(){
    hentAlleBilletter();
});

function hentAlleBilletter() {
    $.get( "/hentBilletter", function( billetter ) {
        formaterBilletter(billetter);
    });
};

function formaterBilletter(billetter){
    var ut = "<table class='table table-striped'>" +
        "<tr>" +
        "<th>Navn</th><th>Antall</th><th>Fornavn</th><th>Etternavn</th><th>Telefon nummer</th><th>E-postadresse</th><th></th><th></th>" +
        "</tr>";
    for(let i in billetter ){
        ut+="<tr>" +
            "<td>"+billetter[i].navn+"</td>"+
            "<td>"+billetter[i].antall+"</td>"+
            "<td>"+billetter[i].fornavn+"</td>"+
            "<td>"+billetter[i].etternavn+"</td>"+
            "<td>"+billetter[i].tlfnr+"</td>"+
            "<td>"+billetter[i].email+"</td>"+
            "<td> <button class='btn btn-danger' onclick='slettEnBillett("+billetter[i].id+")'>Slett</button></td>"+
            "</tr>";
    }
    $("#billettene").html(ut);
}

function slettEnBillett(id) {
    const url = "/slettEnBillett?id="+id;
    $.get( url, function() {
        window.location.href = 'index.html';
    });
};

function slettBillettene() {
    $.get( "/slettAlleBilletter", function() {
        window.location.href = 'index.html';
    });
};