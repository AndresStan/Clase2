from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox, QMessageBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon
from dialogs import CustomDialog


class MainWindow(QMainWindow): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        self.setWindowTitle("MiTitulo")
    
    
        self.etiqueta =  QLabel("Pulsa aqui")
        #etiqueta.clicked.connect(self.mostrarventana)
        self.setCentralWidget(self.etiqueta)
        
    def mouseMoveEvent(self, a0):
        self.etiqueta.setText(f'El raton se ha movido ${a0.position()} ')
        
    def mousePressEvent(self, a0):
        self.etiqueta.setText(f'El raton se ha pulsado ${a0.position()} ')
        
    def mouseReleaseEvent(self, a0):
        self.etiqueta.setText(f'El raton se ha soltado ${a0.position()} ')
    def mouseDoubleClickEvent(self, a0):
        self.etiqueta.setText(f'El raton se pulsado doble ${a0.position()} ')
    
    
        
app = QApplication([])
window = MainWindow()

window.show()

app.exec() # Poner siempre si no la ventana se cierra instant