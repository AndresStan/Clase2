from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar
from Color import Color
from PyQt6.QtGui import QAction, QIcon

class MainWindow(QMainWindow): # Asi se crea una clase

    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")
      
      
        etiqueta = QLabel("Etiqueta")
        etiqueta.setAlignment(Qt.AlignmentFlag.AlignCenter) # Simplemente para alinearlo al centro
   
        barra = QToolBar()
        barra.setIconSize(QSize(16,16)) # Para indicarle que todos los iconos tendran este tamaño
        self.addToolBar(barra)
        
        boton = QAction(QIcon("icons/bug.png"), "Boton", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton.setStatusTip("Este boton no hace nada") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        self.setStatusBar(QStatusBar(self)) # Esto!
        boton.triggered.connect(self.botonpulsado)
        
        
        
        boton2 = QAction(QIcon("icons/bug.png"), "Boton 2", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton2.setStatusTip("Este boton no hace nada") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        boton2.triggered.connect(self.botonpulsado)

        barra.addAction(boton)
        
        
        
        barra.addSeparator()
        
        barra.addAction(boton2)
        
        barra.addWidget(QLabel("Texto"))
        barra.addWidget(QCheckBox("Seleccion"))
        
        self.setCentralWidget(etiqueta)

    def botonpulsado(self, s):
        print("Pulsado", s)
        
app = QApplication([])
window = MainWindow()
window.show()

app.exec() # Poner siempre si no la ventana se cierra instant