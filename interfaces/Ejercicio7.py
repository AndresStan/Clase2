from PyQt6.QtCore import QSize, Qt
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton

class MainWindow(QMainWindow): # Asi se crea una clase

    
    

    
    def __init__(self): # Asi se crea una funcion
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.botonpulsado = True
        self.setWindowTitle("MiTitulo")



        boton = QPushButton("Pulsa")
        boton.setCheckable(True)
        boton.clicked.connect(self.botonActivado) # Denominado SIGNAL
        boton.setChecked(self.botonpulsado)



        self.setCentralWidget(boton)

    def botonActivado(self, checked):
        self.botonpulsado=checked
        print(self.botonpulsado)

app = QApplication([])

window = MainWindow()

window.show()



app.exec() # Poner siempre si no la ventana se cierra instant