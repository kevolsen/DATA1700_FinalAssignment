function lagreBillett() {
    $("#errorNavn, #errorAntall, #errorFornavn, #errorEtternavn, #errorTlfnr, #errorEmail").html("");

    const emailRegex = /^[\w-]+(\.[\w-]+)*@([\w-]+\.)+[a-zA-Z]{2,7}$/;
    const tlfnrRegex = /^[0-9\+]{8,12}$/;

    const billett = {
        navn : $("#navn").val(),
        antall : $("#antall").val(),
        fornavn : $("#fornavn").val(),
        etternavn : $("#etternavn").val(),
        tlfnr : $("#tlfnr").val(),
        email : $("#email").val(),
    }

    for (let key in billett) {
        if (!billett[key]) {
            $("#error" + key.charAt(0).toUpperCase() + key.slice(1)).html("Vennligst fyll ut " + key + ".").css("color", "red");
            return;
        }
    }

    if (!tlfnrRegex.test(billett.tlfnr)) {
        $("#errorTlfnr").html("Ugyldig telefonnummer. Vennligst fyll ut et telefonnummer på 8 siffer, uten mellomrom.").css("color", "red");
        return;
    }

    if (!emailRegex.test(billett.email)) {
        $("#errorEmail").html("Ugyldig e-postadresse.").css("color", "red");
        return;
    }

    const url = "/lagreBillett";
    $.post( url, billett, function() {
        window.location.href = 'index.html';
    });
};