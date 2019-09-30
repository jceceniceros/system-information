import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetworkInfo {

    public static void getInterfacesInfo()
    {
        try {
            Enumeration<NetworkInterface> interfaces = NetworkInterface.getNetworkInterfaces();
            while (interfaces.hasMoreElements()) {
                printNetworkInterface(interfaces.nextElement());
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al recuperar las interfaces de red");
        }
    }

    private static void printNetworkInterface(NetworkInterface i)
    {
        try {
            System.out.println("----------");
            System.out.println("  ID: " + i.getIndex());
            System.out.println("NAME: " + i.getDisplayName());
            System.out.println(" MAC: " + formatMACAddress(i.getHardwareAddress()));
        } catch (Exception e) {
            System.out.println("Ocurrió un error al recuperar la información de la interfaz de red");
        }
    }

    private static String formatMACAddress(byte[] mac)
    {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			builder.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));
		}
		return builder.toString();
    }
}
