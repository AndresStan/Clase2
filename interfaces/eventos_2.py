from PyQt6.QtCore import Qt, QSize
from PyQt6.QtWidgets import QMenu ,QApplication, QMainWindow, QPushButton, QLabel, QLineEdit, QVBoxLayout, QWidget, QCheckBox, QDoubleSpinBox, QSpinBox, QSlider, QDial, QCalendarWidget, QVBoxLayout, QHBoxLayout, QGroupBox, QRadioButton, QGridLayout, QStackedLayout, QTabWidget, QToolBar, QStatusBar, QDialog, QDialogButtonBox, QMessageBox
from Color import Color
from PyQt6.QtGui import QAction, QIcon
from dialogs import CustomDialog




class MainWindow(QMainWindow): # Asi se crea una clase
    def __init__(self): # Asi se crea una funcion
        super().__init__()
        self.setWindowTitle("MiTitulo")
    
     
     # FUNCION GUAPISIMA PARA CLICK DERECHO
    def contextMenuEvent(self, e):
        context = QMenu(self)
        context.addAction(QAction("Accion 1", self))
        context.addAction(QAction("Accion 2", self))
        context.addAction(QAction("Accion 3", self))
        
        context.exec(e.globalPos())




        
app = QApplication([])
window = MainWindow()

window.show()

app.exec() # Poner siempre si no la ventana se cierra instant