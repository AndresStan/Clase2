from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar
from Color import Color
from PyQt6.QtGui import QAction, QIcon

class MainWindow(QMainWindow): # Asi se crea una clase

    cont = 0

    def __init__(self): # Asi se crea una funcio 
        super().__init__() # Siempre se pone asi para crear la funcion dentro de una clase (se llamara nada mas llamar a la clase)
        self.setWindowTitle("MiAplicacion")
      
      
        self.etiqueta = QLabel("¡Hola!")
        self.etiqueta.setAlignment(Qt.AlignmentFlag.AlignCenter) # Simplemente para alinearlo al centro
   
        barra = QToolBar() 
        barra.setIconSize(QSize(16,16)) # Para indicarle que todos los iconos tendran este tamaño
        self.addToolBar(barra)
        
        boton = QAction(QIcon("icons/bug.png"), "Boton", self) # Se usa QAction para reutilizar codigo, fijate como pongo QIcon y la ruta para añadirle el icono
        boton.setStatusTip("Este boton no hace nada") # Para que al hacer hover sobre el boton salga el tip (necesita lo de abajo tambien)
        self.setStatusBar(QStatusBar(self)) # Esto!
       
   
        boton.triggered.connect(self.botonpulsado)
        
        
    
        barra.addAction(boton)
        
        menu = self.menuBar()
        menu_archivo = menu.addMenu("&Archivo")
      
        menu_archivo.addAction(boton)
   
    

    
        
        barra.addSeparator()
       
        self.setCentralWidget(self.etiqueta)

    def botonpulsado(self, s):
        self.cont+=1
        self.etiqueta.setText(f"Texto cambiado {self.cont}")
        
app = QApplication([])
window = MainWindow()
window.show()

app.exec() # Poner siempre si no la ventana se cierra instant