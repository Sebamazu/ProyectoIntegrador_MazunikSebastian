export class Experiencia {
    id?: number;
    nombreE!: string;
    descripcionE!: string;

    contructor(nombreE: string, descripcionE: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
    }
}