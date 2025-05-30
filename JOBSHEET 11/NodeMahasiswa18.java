public class NodeMahasiswa18 {
    Mahasiswa18 data;
    NodeMahasiswa18 next;

    NodeMahasiswa18(Mahasiswa18 data, NodeMahasiswa18 next) {
        this.data = data;
        this.next = null;
    }

    public void tampilNode() {
        if (data != null) {
            data.tampilInformasi();
        } else {
            System.out.println("Node is empty.");
        }
    }
}