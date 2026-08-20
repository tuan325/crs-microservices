// path: crs-frontend/src/api/axiosClient.ts
import axios from 'axios';

const axiosClient = axios.create({
    baseURL: import.meta.env.VITE_API_BASE_URL, // Tự động lấy đường link từ file .env lúc nãy
    headers: {
        'Content-Type': 'application/json',
    },
});

export default axiosClient;