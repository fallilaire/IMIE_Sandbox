function initExo1() {
  var listLi = document.getElementsByClassName('exo1');
  for (variable of listLi) {
    variable.addEventListener('click', function(e) {
      var listLi2 = document.getElementsByClassName('exo1');
      for (subVar of listLi2) {
        subVar.classList.remove('active');
      }
      e.target.classList.add('active');
    });
  }
}

function initExo2() {
  var input = document.getElementById("text_exo2");
  input.addEventListener('keypress', function(e) {
    var listLi = document.getElementsByClassName('exo2');
    if (e.keyCode == 13) {
      if (listLi.length > 0) {
        e.currentTarget.value = "";
      }
    }
    else {
      listLi[listLi.length-1].textContent = e.currentTarget.value + e.key;
    }
  });

  var listLi = document.getElementsByClassName('exo2');
  for (variable of listLi) {
    variable.addEventListener('click', function(e) {
      e.currentTarget.parentElement.removeChild(e.currentTarget);
    });
  }

}

function initExo4() {
  var input = document.getElementById("exo4_text");
  input.addEventListener('keypress', function(e) {
    if (e.keyCode == 13) {
      var ul = document.getElementById('exo4_ul');
      var li = document.createElement('li');
      li.textContent = e.currentTarget.value;

      e.currentTarget.value = "";
      li.addEventListener('click', function(e) {
        li.className = 'finished';
      });

      var del = document.createElement('input');
      del.type = 'button';
      del.value = 'Delete';
      del.addEventListener('click', function(e) {
        var currentLi = e.currentTarget.parentElement;
        currentLi.parentElement.removeChild(currentLi);
      });

      li.appendChild(del);

      ul.appendChild(li);
    }
  });
}

function initExo5() {
  // ajout event sur ul
  var ul = document.getElementById('exo5');
  ul.addEventListener('drop', function(e) {
    e.preventDefault();
    var data = e.dataTransfer.getData("text");
    document.getElementById('exo5').insertBefore(document.getElementById(data), e.target);
  });
  ul.addEventListener('dragover', function(e) {
    e.preventDefault();
  });

  // ajout event et id sur li
  lis = ul.children;
  for (var index = 0; index < lis.length; index++) {
    var li = lis[index];
    li.setAttribute('draggable', 'true');
    li.addEventListener('dragstart', function(e) {
        e.dataTransfer.setData("text", e.target.id);
    });
    li.id = 'exo_li_' + index;
  }

}